package defpackage;

/* JADX INFO: renamed from: ᛱᛴᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0083 extends defpackage.AbstractC1952 {

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f825;

    public /* synthetic */ C0083(defpackage.C1326 r1, int r2) {
            r0 = this;
            r0.f825 = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.AbstractC1725
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object mo545(java.lang.Object r6) {
            r5 = this;
            int r5 = r5.f825
            r0 = 0
            switch(r5) {
                case 0: goto L248;
                case 1: goto L225;
                case 2: goto L1f3;
                case 3: goto L1d0;
                case 4: goto L19e;
                case 5: goto L17b;
                case 6: goto L126;
                case 7: goto L103;
                case 8: goto Ld1;
                case 9: goto Lae;
                case 10: goto L7c;
                case 11: goto L56;
                case 12: goto L2a;
                default: goto L6;
            }
        L6:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            long[] r5 = new long[r5]
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r6.next()
            int r2 = r0 + 1
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            long r3 = (long) r1
            r5[r0] = r3
            r0 = r2
            goto L12
        L29:
            return r5
        L2a:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            java.lang.Character[] r5 = new java.lang.Character[r5]
            java.util.Iterator r6 = r6.iterator()
            r1 = r0
        L37:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r6.next()
            if (r2 != 0) goto L44
            goto L37
        L44:
            java.lang.String r2 = r2.toString()
            char r2 = r2.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r5[r1] = r2
            int r1 = r1 + 1
            goto L37
        L55:
            return r5
        L56:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            char[] r5 = new char[r5]
            java.util.Iterator r6 = r6.iterator()
            r1 = r0
        L63:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r6.next()
            int r3 = r1 + 1
            java.lang.String r2 = r2.toString()
            char r2 = r2.charAt(r0)
            r5[r1] = r2
            r1 = r3
            goto L63
        L7b:
            return r5
        L7c:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            java.lang.Byte[] r5 = new java.lang.Byte[r5]
            java.util.Iterator r6 = r6.iterator()
        L88:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lad
            java.lang.Object r1 = r6.next()
            if (r1 != 0) goto L95
            goto L88
        L95:
            boolean r2 = r1 instanceof java.lang.Byte
            if (r2 == 0) goto L9e
            java.lang.Byte r1 = (java.lang.Byte) r1
            r5[r0] = r1
            goto Laa
        L9e:
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r5[r0] = r1
        Laa:
            int r0 = r0 + 1
            goto L88
        Lad:
            return r5
        Lae:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            byte[] r5 = new byte[r5]
            java.util.Iterator r6 = r6.iterator()
        Lba:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Ld0
            java.lang.Object r1 = r6.next()
            int r2 = r0 + 1
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            r5[r0] = r1
            r0 = r2
            goto Lba
        Ld0:
            return r5
        Ld1:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            java.lang.Integer[] r5 = new java.lang.Integer[r5]
            java.util.Iterator r6 = r6.iterator()
        Ldd:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L102
            java.lang.Object r1 = r6.next()
            if (r1 != 0) goto Lea
            goto Ldd
        Lea:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto Lf3
            java.lang.Integer r1 = (java.lang.Integer) r1
            r5[r0] = r1
            goto Lff
        Lf3:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r0] = r1
        Lff:
            int r0 = r0 + 1
            goto Ldd
        L102:
            return r5
        L103:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            int[] r5 = new int[r5]
            java.util.Iterator r6 = r6.iterator()
        L10f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L125
            java.lang.Object r1 = r6.next()
            int r2 = r0 + 1
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r5[r0] = r1
            r0 = r2
            goto L10f
        L125:
            return r5
        L126:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            java.lang.Boolean[] r5 = new java.lang.Boolean[r5]
            java.util.Iterator r6 = r6.iterator()
            r1 = r0
        L133:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L17a
            java.lang.Object r2 = r6.next()
            if (r2 != 0) goto L140
            goto L133
        L140:
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L149
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r5[r1] = r2
            goto L15e
        L149:
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L161
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 == 0) goto L157
            r2 = 1
            goto L158
        L157:
            r2 = r0
        L158:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5[r1] = r2
        L15e:
            int r1 = r1 + 1
            goto L133
        L161:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "can not convert "
            r6.<init>(r0)
            r6.append(r2)
            java.lang.String r0 = " toBoolean"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L17a:
            return r5
        L17b:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            boolean[] r5 = new boolean[r5]
            java.util.Iterator r6 = r6.iterator()
        L187:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L19d
            java.lang.Object r1 = r6.next()
            int r2 = r0 + 1
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5[r0] = r1
            r0 = r2
            goto L187
        L19d:
            return r5
        L19e:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            java.lang.Double[] r5 = new java.lang.Double[r5]
            java.util.Iterator r6 = r6.iterator()
        L1aa:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L1cf
            java.lang.Object r1 = r6.next()
            if (r1 != 0) goto L1b7
            goto L1aa
        L1b7:
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 == 0) goto L1c0
            java.lang.Double r1 = (java.lang.Double) r1
            r5[r0] = r1
            goto L1cc
        L1c0:
            java.lang.Number r1 = (java.lang.Number) r1
            double r1 = r1.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r5[r0] = r1
        L1cc:
            int r0 = r0 + 1
            goto L1aa
        L1cf:
            return r5
        L1d0:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            double[] r5 = new double[r5]
            java.util.Iterator r6 = r6.iterator()
        L1dc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L1f2
            java.lang.Object r1 = r6.next()
            int r2 = r0 + 1
            java.lang.Number r1 = (java.lang.Number) r1
            double r3 = r1.doubleValue()
            r5[r0] = r3
            r0 = r2
            goto L1dc
        L1f2:
            return r5
        L1f3:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            java.lang.Float[] r5 = new java.lang.Float[r5]
            java.util.Iterator r6 = r6.iterator()
        L1ff:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L224
            java.lang.Object r1 = r6.next()
            if (r1 != 0) goto L20c
            goto L1ff
        L20c:
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L215
            java.lang.Float r1 = (java.lang.Float) r1
            r5[r0] = r1
            goto L221
        L215:
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r5[r0] = r1
        L221:
            int r0 = r0 + 1
            goto L1ff
        L224:
            return r5
        L225:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            float[] r5 = new float[r5]
            java.util.Iterator r6 = r6.iterator()
        L231:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L247
            java.lang.Object r1 = r6.next()
            int r2 = r0 + 1
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r5[r0] = r1
            r0 = r2
            goto L231
        L247:
            return r5
        L248:
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            java.lang.Long[] r5 = new java.lang.Long[r5]
            java.util.Iterator r6 = r6.iterator()
        L254:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L279
            java.lang.Object r1 = r6.next()
            if (r1 != 0) goto L261
            goto L254
        L261:
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L26a
            java.lang.Long r1 = (java.lang.Long) r1
            r5[r0] = r1
            goto L276
        L26a:
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5[r0] = r1
        L276:
            int r0 = r0 + 1
            goto L254
        L279:
            return r5
    }
}
