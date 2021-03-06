package com.tickaroo.tikxml.autovalue

import com.tickaroo.tikxml.annotation.Xml
import com.tickaroo.tikxml.processor.ProcessorConstants.AUTO_VALUE_POST_FIX
import javax.lang.model.element.TypeElement

/**
 * This class represents a AutoValue annotated
 * @author Hannes Dorfmann
 */
data class AutoValueAnnotatedClass(
        val packageName: String,
        val autoValueClass: TypeElement,
        val xmlAnnotation: Xml,
        val propertyMethods: List<AnnotatedMethod<*>>) {
    val valueHolderClassName = autoValueClass.simpleName.toString() + AUTO_VALUE_POST_FIX
}