package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion f13530Companion = null;
    private final java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> values;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType[] r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue     // Catch: java.lang.NoSuchFieldError -> L2b
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                    r2 = 4
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
                L2b:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue     // Catch: java.lang.NoSuchFieldError -> L34
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                    r2 = 5
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
                L34:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue     // Catch: java.lang.NoSuchFieldError -> L3d
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                    r2 = 6
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                L3d:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue     // Catch: java.lang.NoSuchFieldError -> L46
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                    r2 = 7
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
                L46:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue     // Catch: java.lang.NoSuchFieldError -> L50
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                    r2 = 8
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
                L50:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue     // Catch: java.lang.NoSuchFieldError -> L5a
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                    r2 = 9
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5a
                L5a:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue     // Catch: java.lang.NoSuchFieldError -> L64
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                    r2 = 10
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L64
                L64:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue     // Catch: java.lang.NoSuchFieldError -> L6e
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                    r2 = 11
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
                L6e:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue     // Catch: java.lang.NoSuchFieldError -> L78
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                    r2 = 12
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
                L78:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue     // Catch: java.lang.NoSuchFieldError -> L82
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                    r2 = 13
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
                L82:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue     // Catch: java.lang.NoSuchFieldError -> L8c
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8c
                    r2 = 14
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8c
                L8c:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue     // Catch: java.lang.NoSuchFieldError -> L96
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
                    r2 = 15
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
                L96:
                    org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.result.AnnotationEncodeArrayData from(org.luckypray.dexkit.DexKitBridge r7, org.luckypray.dexkit.schema.AnnotationEncodeArray r8) {
                r6 = this;
                r7.getClass()
                r8.getClass()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                int r0 = r8.getValuesLength()
                r1 = 0
            L10:
                if (r1 >= r0) goto L1b3
                org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r2 = r8.values(r1)
                r2.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType$Companion r3 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.Companion
                byte r4 = r2.m7410getValueTypew2LRezQ()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r3 = r3.m7397from7apg3OU(r4)
                int[] r4 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion.WhenMappings.$EnumSwitchMapping$0
                int r5 = r3.ordinal()
                r4 = r4[r5]
                switch(r4) {
                    case 1: goto L18d;
                    case 2: goto L176;
                    case 3: goto L15f;
                    case 4: goto L148;
                    case 5: goto L131;
                    case 6: goto L11a;
                    case 7: goto L102;
                    case 8: goto Lc9;
                    case 9: goto Lb3;
                    case 10: goto L9d;
                    case 11: goto L87;
                    case 12: goto L71;
                    case 13: goto L5b;
                    case 14: goto L4b;
                    case 15: goto L33;
                    default: goto L2e;
                }
            L2e:
                p000.C1080.m7272()
                r6 = 0
                return r6
            L33:
                org.luckypray.dexkit.schema.-EncodeValueBoolean r4 = new org.luckypray.dexkit.schema.-EncodeValueBoolean
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueBoolean r2 = (org.luckypray.dexkit.schema.EncodeValueBoolean) r2
                boolean r2 = r2.getValue()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L1a3
            L4b:
                org.luckypray.dexkit.schema.-EncodeValueNull r4 = new org.luckypray.dexkit.schema.-EncodeValueNull
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueNull r2 = (org.luckypray.dexkit.schema.EncodeValueNull) r2
                goto L1a3
            L5b:
                org.luckypray.dexkit.result.AnnotationData$-Companion r4 = org.luckypray.dexkit.result.AnnotationData.f13528Companion
                org.luckypray.dexkit.schema.-AnnotationMeta r5 = new org.luckypray.dexkit.schema.-AnnotationMeta
                r5.<init>()
                p22 r2 = r2.value(r5)
                r2.getClass()
                org.luckypray.dexkit.schema.-AnnotationMeta r2 = (org.luckypray.dexkit.schema.AnnotationMeta) r2
                org.luckypray.dexkit.result.AnnotationData r2 = r4.from(r7, r2)
                goto L1a3
            L71:
                org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r4 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.f13530Companion
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r5 = new org.luckypray.dexkit.schema.-AnnotationEncodeArray
                r5.<init>()
                p22 r2 = r2.value(r5)
                r2.getClass()
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r2 = (org.luckypray.dexkit.schema.AnnotationEncodeArray) r2
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r2 = r4.from(r7, r2)
                goto L1a3
            L87:
                org.luckypray.dexkit.result.FieldData$-Companion r4 = org.luckypray.dexkit.result.FieldData.f13533Companion
                org.luckypray.dexkit.schema.-FieldMeta r5 = new org.luckypray.dexkit.schema.-FieldMeta
                r5.<init>()
                p22 r2 = r2.value(r5)
                r2.getClass()
                org.luckypray.dexkit.schema.-FieldMeta r2 = (org.luckypray.dexkit.schema.FieldMeta) r2
                org.luckypray.dexkit.result.FieldData r2 = r4.from(r7, r2)
                goto L1a3
            L9d:
                org.luckypray.dexkit.result.MethodData$-Companion r4 = org.luckypray.dexkit.result.MethodData.f13534Companion
                org.luckypray.dexkit.schema.-MethodMeta r5 = new org.luckypray.dexkit.schema.-MethodMeta
                r5.<init>()
                p22 r2 = r2.value(r5)
                r2.getClass()
                org.luckypray.dexkit.schema.-MethodMeta r2 = (org.luckypray.dexkit.schema.MethodMeta) r2
                org.luckypray.dexkit.result.MethodData r2 = r4.from(r7, r2)
                goto L1a3
            Lb3:
                org.luckypray.dexkit.result.ClassData$-Companion r4 = org.luckypray.dexkit.result.ClassData.f13532Companion
                org.luckypray.dexkit.schema.-ClassMeta r5 = new org.luckypray.dexkit.schema.-ClassMeta
                r5.<init>()
                p22 r2 = r2.value(r5)
                r2.getClass()
                org.luckypray.dexkit.schema.-ClassMeta r2 = (org.luckypray.dexkit.schema.ClassMeta) r2
                org.luckypray.dexkit.result.ClassData r2 = r4.from(r7, r2)
                goto L1a3
            Lc9:
                org.luckypray.dexkit.schema.-EncodeValueString r4 = new org.luckypray.dexkit.schema.-EncodeValueString
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueString r2 = (org.luckypray.dexkit.schema.EncodeValueString) r2
                java.lang.String r4 = r2.getValue()     // Catch: java.lang.IllegalArgumentException -> Le1
                r4.getClass()     // Catch: java.lang.IllegalArgumentException -> Le1
                r2 = r4
                goto L1a3
            Le1:
                java.nio.ByteBuffer r2 = r2.getValueAsByteBuffer()     // Catch: java.lang.Throwable -> Lee
                java.lang.String r2 = org.luckypray.dexkit.util.MUtf8Util.decode(r2)     // Catch: java.lang.Throwable -> Lee
                java.lang.String r2 = org.luckypray.dexkit.util.StringUnicodeEncoderDecoder.encodeStringToUnicodeSequence(r2)     // Catch: java.lang.Throwable -> Lee
                goto Lf5
            Lee:
                r2 = move-exception
                eo1 r4 = new eo1
                r4.<init>(r2)
                r2 = r4
            Lf5:
                java.lang.Throwable r4 = p000.fo1.m2190(r2)
                if (r4 != 0) goto Lfc
                goto Lfe
            Lfc:
                java.lang.String r2 = ""
            Lfe:
                java.lang.String r2 = (java.lang.String) r2
                goto L1a3
            L102:
                org.luckypray.dexkit.schema.-EncodeValueDouble r4 = new org.luckypray.dexkit.schema.-EncodeValueDouble
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueDouble r2 = (org.luckypray.dexkit.schema.EncodeValueDouble) r2
                double r4 = r2.getValue()
                java.lang.Double r2 = java.lang.Double.valueOf(r4)
                goto L1a3
            L11a:
                org.luckypray.dexkit.schema.-EncodeValueFloat r4 = new org.luckypray.dexkit.schema.-EncodeValueFloat
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueFloat r2 = (org.luckypray.dexkit.schema.EncodeValueFloat) r2
                float r2 = r2.getValue()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                goto L1a3
            L131:
                org.luckypray.dexkit.schema.-EncodeValueLong r4 = new org.luckypray.dexkit.schema.-EncodeValueLong
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueLong r2 = (org.luckypray.dexkit.schema.EncodeValueLong) r2
                long r4 = r2.getValue()
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                goto L1a3
            L148:
                org.luckypray.dexkit.schema.-EncodeValueInt r4 = new org.luckypray.dexkit.schema.-EncodeValueInt
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueInt r2 = (org.luckypray.dexkit.schema.EncodeValueInt) r2
                int r2 = r2.getValue()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L1a3
            L15f:
                org.luckypray.dexkit.schema.-EncodeValueChar r4 = new org.luckypray.dexkit.schema.-EncodeValueChar
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueChar r2 = (org.luckypray.dexkit.schema.EncodeValueChar) r2
                short r2 = r2.getValue()
                java.lang.Short r2 = java.lang.Short.valueOf(r2)
                goto L1a3
            L176:
                org.luckypray.dexkit.schema.-EncodeValueShort r4 = new org.luckypray.dexkit.schema.-EncodeValueShort
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueShort r2 = (org.luckypray.dexkit.schema.EncodeValueShort) r2
                short r2 = r2.getValue()
                java.lang.Short r2 = java.lang.Short.valueOf(r2)
                goto L1a3
            L18d:
                org.luckypray.dexkit.schema.-EncodeValueByte r4 = new org.luckypray.dexkit.schema.-EncodeValueByte
                r4.<init>()
                p22 r2 = r2.value(r4)
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueByte r2 = (org.luckypray.dexkit.schema.EncodeValueByte) r2
                byte r2 = r2.getValue()
                java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            L1a3:
                r2.getClass()
                org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion r4 = org.luckypray.dexkit.result.AnnotationEncodeValue.f13531Companion
                org.luckypray.dexkit.result.AnnotationEncodeValue r2 = r4.from(r2, r3)
                r6.add(r2)
                int r1 = r1 + 1
                goto L10
            L1b3:
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r8 = new org.luckypray.dexkit.result.AnnotationEncodeArrayData
                r0 = 0
                r8.<init>(r7, r6, r0)
                return r8
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r0 = new org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationEncodeArrayData.f13530Companion = r0
            return
    }

    private AnnotationEncodeArrayData(org.luckypray.dexkit.DexKitBridge r7, java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> r8) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.values = r8
            return
    }

    public /* synthetic */ AnnotationEncodeArrayData(org.luckypray.dexkit.DexKitBridge r1, java.util.List r2, p000.AbstractC1067zq r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public final java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> getValues() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> r0 = r0.values
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> r4 = r4.values
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L2a
            org.luckypray.dexkit.result.AnnotationEncodeValue r2 = (org.luckypray.dexkit.result.AnnotationEncodeValue) r2
            if (r1 == 0) goto L25
            java.lang.String r1 = ", "
            r0.append(r1)
        L25:
            r0.append(r2)
            r1 = r3
            goto Le
        L2a:
            p000.AbstractC1021yh.m6917()
            r4 = 0
            throw r4
        L2f:
            java.lang.String r4 = "}"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
