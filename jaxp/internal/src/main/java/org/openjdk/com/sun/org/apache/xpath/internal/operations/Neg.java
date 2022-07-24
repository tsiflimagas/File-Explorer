/*
 * reserved comment block
 * DO NOT REMOVE OR ALTER!
 */
/*
 * Copyright 1999-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * $Id: Neg.java,v 1.2.4.1 2005/09/14 21:31:45 jeffsuttor Exp $
 */
package org.openjdk.com.sun.org.apache.xpath.internal.operations;

import org.openjdk.com.sun.org.apache.xpath.internal.XPathContext;
import org.openjdk.com.sun.org.apache.xpath.internal.objects.XNumber;
import org.openjdk.com.sun.org.apache.xpath.internal.objects.XObject;

/**
 * The unary '-' operation expression executer.
 */
public class Neg extends UnaryOperation {
    static final long serialVersionUID = -6280607702375702291L;

    /**
     * Apply the operation to two operands, and return the result.
     *
     * @param right non-null reference to the evaluated right operand.
     * @return non-null reference to the XObject that represents the result of the operation.
     * @throws org.openjdk.javax.xml.transform.TransformerException
     */
    public XObject operate(XObject right) throws org.openjdk.javax.xml.transform.TransformerException {
        return new XNumber(-right.num());
    }

    /**
     * Evaluate this operation directly to a double.
     *
     * @param xctxt The runtime execution context.
     * @return The result of the operation as a double.
     * @throws org.openjdk.javax.xml.transform.TransformerException
     */
    public double num(XPathContext xctxt)
            throws org.openjdk.javax.xml.transform.TransformerException {

        return -(m_right.num(xctxt));
    }

}
