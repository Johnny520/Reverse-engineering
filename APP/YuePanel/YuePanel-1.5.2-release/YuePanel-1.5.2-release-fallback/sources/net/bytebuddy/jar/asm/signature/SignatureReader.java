package net.bytebuddy.jar.asm.signature;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureReader {
    private final java.lang.String signatureValue;

    public SignatureReader(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.signatureValue = r1
            return
    }

    private static int parseType(java.lang.String r9, int r10, net.bytebuddy.jar.asm.signature.SignatureVisitor r11) {
            int r0 = r10 + 1
            char r10 = r9.charAt(r10)
            r1 = 70
            if (r10 == r1) goto Lbc
            r1 = 76
            r2 = 59
            r3 = 1
            if (r10 == r1) goto L4c
            r1 = 86
            if (r10 == r1) goto Lbc
            r1 = 73
            if (r10 == r1) goto Lbc
            r1 = 74
            if (r10 == r1) goto Lbc
            r1 = 83
            if (r10 == r1) goto Lbc
            r1 = 84
            if (r10 == r1) goto L3f
            r1 = 90
            if (r10 == r1) goto Lbc
            r1 = 91
            if (r10 == r1) goto L36
            switch(r10) {
                case 66: goto Lbc;
                case 67: goto Lbc;
                case 68: goto Lbc;
                default: goto L30;
            }
        L30:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L36:
            net.bytebuddy.jar.asm.signature.SignatureVisitor r10 = r11.visitArrayType()
            int r9 = parseType(r9, r0, r10)
            return r9
        L3f:
            int r10 = r9.indexOf(r2, r0)
            java.lang.String r9 = r9.substring(r0, r10)
            r11.visitTypeVariable(r9)
            int r10 = r10 + r3
            return r10
        L4c:
            r10 = 0
            r4 = r10
            r5 = r4
        L4f:
            r1 = r0
        L50:
            int r6 = r0 + 1
            char r7 = r9.charAt(r0)
            r8 = 46
            if (r7 == r8) goto La3
            if (r7 != r2) goto L5d
            goto La3
        L5d:
            r8 = 60
            if (r7 != r8) goto La1
            java.lang.String r0 = r9.substring(r1, r0)
            if (r5 == 0) goto L6b
            r11.visitInnerClassType(r0)
            goto L6e
        L6b:
            r11.visitClassType(r0)
        L6e:
            r0 = r6
        L6f:
            char r4 = r9.charAt(r0)
            r6 = 62
            if (r4 == r6) goto L9f
            r6 = 42
            if (r4 == r6) goto L99
            r6 = 43
            if (r4 == r6) goto L8e
            r6 = 45
            if (r4 == r6) goto L8e
            r4 = 61
            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r11.visitTypeArgument(r4)
            int r0 = parseType(r9, r0, r4)
            goto L6f
        L8e:
            int r0 = r0 + 1
            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r11.visitTypeArgument(r4)
            int r0 = parseType(r9, r0, r4)
            goto L6f
        L99:
            int r0 = r0 + 1
            r11.visitTypeArgument()
            goto L6f
        L9f:
            r4 = r3
            goto L50
        La1:
            r0 = r6
            goto L50
        La3:
            if (r4 != 0) goto Lb2
            java.lang.String r0 = r9.substring(r1, r0)
            if (r5 == 0) goto Laf
            r11.visitInnerClassType(r0)
            goto Lb2
        Laf:
            r11.visitClassType(r0)
        Lb2:
            if (r7 != r2) goto Lb8
            r11.visitEnd()
            return r6
        Lb8:
            r4 = r10
            r5 = r3
            r0 = r6
            goto L4f
        Lbc:
            r11.visitBaseType(r10)
            return r0
    }

    public void accept(net.bytebuddy.jar.asm.signature.SignatureVisitor r7) {
            r6 = this;
            java.lang.String r0 = r6.signatureValue
            int r1 = r0.length()
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 60
            if (r3 != r4) goto L4e
            r2 = 2
        L10:
            r3 = 58
            int r4 = r0.indexOf(r3, r2)
            int r2 = r2 + (-1)
            java.lang.String r2 = r0.substring(r2, r4)
            r7.visitFormalTypeParameter(r2)
            int r4 = r4 + 1
            char r2 = r0.charAt(r4)
            r5 = 76
            if (r2 == r5) goto L31
            r5 = 91
            if (r2 == r5) goto L31
            r5 = 84
            if (r2 != r5) goto L39
        L31:
            net.bytebuddy.jar.asm.signature.SignatureVisitor r2 = r7.visitClassBound()
            int r4 = parseType(r0, r4, r2)
        L39:
            int r2 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 != r3) goto L4a
            net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r7.visitInterfaceBound()
            int r4 = parseType(r0, r2, r4)
            goto L39
        L4a:
            r3 = 62
            if (r4 != r3) goto L10
        L4e:
            char r3 = r0.charAt(r2)
            r4 = 40
            if (r3 != r4) goto L80
            int r2 = r2 + 1
        L58:
            char r3 = r0.charAt(r2)
            r4 = 41
            if (r3 == r4) goto L69
            net.bytebuddy.jar.asm.signature.SignatureVisitor r3 = r7.visitParameterType()
            int r2 = parseType(r0, r2, r3)
            goto L58
        L69:
            int r2 = r2 + 1
            net.bytebuddy.jar.asm.signature.SignatureVisitor r3 = r7.visitReturnType()
            int r2 = parseType(r0, r2, r3)
        L73:
            if (r2 >= r1) goto L93
            int r2 = r2 + 1
            net.bytebuddy.jar.asm.signature.SignatureVisitor r3 = r7.visitExceptionType()
            int r2 = parseType(r0, r2, r3)
            goto L73
        L80:
            net.bytebuddy.jar.asm.signature.SignatureVisitor r3 = r7.visitSuperclass()
            int r2 = parseType(r0, r2, r3)
        L88:
            if (r2 >= r1) goto L93
            net.bytebuddy.jar.asm.signature.SignatureVisitor r3 = r7.visitInterface()
            int r2 = parseType(r0, r2, r3)
            goto L88
        L93:
            return
    }

    public void acceptType(net.bytebuddy.jar.asm.signature.SignatureVisitor r3) {
            r2 = this;
            java.lang.String r0 = r2.signatureValue
            r1 = 0
            parseType(r0, r1, r3)
            return
    }
}
