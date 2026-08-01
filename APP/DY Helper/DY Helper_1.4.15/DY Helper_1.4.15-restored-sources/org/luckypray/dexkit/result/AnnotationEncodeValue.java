package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeValue {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.AnnotationEncodeValue.Companion f13531Companion = null;
    private final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType type;
    private final java.lang.Object value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion$WhenMappings */
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
                    org.luckypray.dexkit.result.AnnotationEncodeValue.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
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

        public final org.luckypray.dexkit.result.AnnotationEncodeValue from(java.lang.Object r2, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.result.AnnotationEncodeValue r1 = new org.luckypray.dexkit.result.AnnotationEncodeValue
                r0 = 0
                r1.<init>(r2, r3, r0)
                return r1
        }

        public final org.luckypray.dexkit.result.AnnotationEncodeValue from(org.luckypray.dexkit.DexKitBridge r3, org.luckypray.dexkit.schema.AnnotationEncodeValueMeta r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType$Companion r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.Companion
                byte r0 = r4.m7410getValueTypew2LRezQ()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = r2.m7397from7apg3OU(r0)
                int[] r0 = org.luckypray.dexkit.result.AnnotationEncodeValue.Companion.WhenMappings.$EnumSwitchMapping$0
                int r1 = r2.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L158;
                    case 2: goto L141;
                    case 3: goto L12a;
                    case 4: goto L113;
                    case 5: goto Lfc;
                    case 6: goto Le5;
                    case 7: goto Lcd;
                    case 8: goto Lb6;
                    case 9: goto La0;
                    case 10: goto L8a;
                    case 11: goto L74;
                    case 12: goto L5e;
                    case 13: goto L48;
                    case 14: goto L38;
                    case 15: goto L20;
                    default: goto L1b;
                }
            L1b:
                p000.C1080.m7272()
                r2 = 0
                return r2
            L20:
                org.luckypray.dexkit.schema.-EncodeValueBoolean r3 = new org.luckypray.dexkit.schema.-EncodeValueBoolean
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueBoolean r3 = (org.luckypray.dexkit.schema.EncodeValueBoolean) r3
                boolean r3 = r3.getValue()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                goto L16e
            L38:
                org.luckypray.dexkit.schema.-EncodeValueNull r3 = new org.luckypray.dexkit.schema.-EncodeValueNull
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueNull r3 = (org.luckypray.dexkit.schema.EncodeValueNull) r3
                goto L16e
            L48:
                org.luckypray.dexkit.result.AnnotationData$-Companion r0 = org.luckypray.dexkit.result.AnnotationData.f13528Companion
                org.luckypray.dexkit.schema.-AnnotationMeta r1 = new org.luckypray.dexkit.schema.-AnnotationMeta
                r1.<init>()
                p22 r4 = r4.value(r1)
                r4.getClass()
                org.luckypray.dexkit.schema.-AnnotationMeta r4 = (org.luckypray.dexkit.schema.AnnotationMeta) r4
                org.luckypray.dexkit.result.AnnotationData r3 = r0.from(r3, r4)
                goto L16e
            L5e:
                org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r0 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.f13530Companion
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r1 = new org.luckypray.dexkit.schema.-AnnotationEncodeArray
                r1.<init>()
                p22 r4 = r4.value(r1)
                r4.getClass()
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r4 = (org.luckypray.dexkit.schema.AnnotationEncodeArray) r4
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r3 = r0.from(r3, r4)
                goto L16e
            L74:
                org.luckypray.dexkit.result.FieldData$-Companion r0 = org.luckypray.dexkit.result.FieldData.f13533Companion
                org.luckypray.dexkit.schema.-FieldMeta r1 = new org.luckypray.dexkit.schema.-FieldMeta
                r1.<init>()
                p22 r4 = r4.value(r1)
                r4.getClass()
                org.luckypray.dexkit.schema.-FieldMeta r4 = (org.luckypray.dexkit.schema.FieldMeta) r4
                org.luckypray.dexkit.result.FieldData r3 = r0.from(r3, r4)
                goto L16e
            L8a:
                org.luckypray.dexkit.result.MethodData$-Companion r0 = org.luckypray.dexkit.result.MethodData.f13534Companion
                org.luckypray.dexkit.schema.-MethodMeta r1 = new org.luckypray.dexkit.schema.-MethodMeta
                r1.<init>()
                p22 r4 = r4.value(r1)
                r4.getClass()
                org.luckypray.dexkit.schema.-MethodMeta r4 = (org.luckypray.dexkit.schema.MethodMeta) r4
                org.luckypray.dexkit.result.MethodData r3 = r0.from(r3, r4)
                goto L16e
            La0:
                org.luckypray.dexkit.result.ClassData$-Companion r0 = org.luckypray.dexkit.result.ClassData.f13532Companion
                org.luckypray.dexkit.schema.-ClassMeta r1 = new org.luckypray.dexkit.schema.-ClassMeta
                r1.<init>()
                p22 r4 = r4.value(r1)
                r4.getClass()
                org.luckypray.dexkit.schema.-ClassMeta r4 = (org.luckypray.dexkit.schema.ClassMeta) r4
                org.luckypray.dexkit.result.ClassData r3 = r0.from(r3, r4)
                goto L16e
            Lb6:
                org.luckypray.dexkit.schema.-EncodeValueString r3 = new org.luckypray.dexkit.schema.-EncodeValueString
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueString r3 = (org.luckypray.dexkit.schema.EncodeValueString) r3
                java.lang.String r3 = r3.getValue()
                r3.getClass()
                goto L16e
            Lcd:
                org.luckypray.dexkit.schema.-EncodeValueDouble r3 = new org.luckypray.dexkit.schema.-EncodeValueDouble
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueDouble r3 = (org.luckypray.dexkit.schema.EncodeValueDouble) r3
                double r3 = r3.getValue()
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                goto L16e
            Le5:
                org.luckypray.dexkit.schema.-EncodeValueFloat r3 = new org.luckypray.dexkit.schema.-EncodeValueFloat
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueFloat r3 = (org.luckypray.dexkit.schema.EncodeValueFloat) r3
                float r3 = r3.getValue()
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto L16e
            Lfc:
                org.luckypray.dexkit.schema.-EncodeValueLong r3 = new org.luckypray.dexkit.schema.-EncodeValueLong
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueLong r3 = (org.luckypray.dexkit.schema.EncodeValueLong) r3
                long r3 = r3.getValue()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                goto L16e
            L113:
                org.luckypray.dexkit.schema.-EncodeValueInt r3 = new org.luckypray.dexkit.schema.-EncodeValueInt
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueInt r3 = (org.luckypray.dexkit.schema.EncodeValueInt) r3
                int r3 = r3.getValue()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L16e
            L12a:
                org.luckypray.dexkit.schema.-EncodeValueChar r3 = new org.luckypray.dexkit.schema.-EncodeValueChar
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueChar r3 = (org.luckypray.dexkit.schema.EncodeValueChar) r3
                short r3 = r3.getValue()
                java.lang.Short r3 = java.lang.Short.valueOf(r3)
                goto L16e
            L141:
                org.luckypray.dexkit.schema.-EncodeValueShort r3 = new org.luckypray.dexkit.schema.-EncodeValueShort
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueShort r3 = (org.luckypray.dexkit.schema.EncodeValueShort) r3
                short r3 = r3.getValue()
                java.lang.Short r3 = java.lang.Short.valueOf(r3)
                goto L16e
            L158:
                org.luckypray.dexkit.schema.-EncodeValueByte r3 = new org.luckypray.dexkit.schema.-EncodeValueByte
                r3.<init>()
                p22 r3 = r4.value(r3)
                r3.getClass()
                org.luckypray.dexkit.schema.-EncodeValueByte r3 = (org.luckypray.dexkit.schema.EncodeValueByte) r3
                byte r3 = r3.getValue()
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            L16e:
                org.luckypray.dexkit.result.AnnotationEncodeValue r4 = new org.luckypray.dexkit.result.AnnotationEncodeValue
                r0 = 0
                r4.<init>(r3, r2, r0)
                return r4
        }
    }

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
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue     // Catch: java.lang.NoSuchFieldError -> L50
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
            L50:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue     // Catch: java.lang.NoSuchFieldError -> L5a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5a
            L5a:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue     // Catch: java.lang.NoSuchFieldError -> L64
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue     // Catch: java.lang.NoSuchFieldError -> L6e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
            L6e:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
            L82:
                org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion r0 = new org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationEncodeValue.f13531Companion = r0
            return
    }

    private AnnotationEncodeValue(java.lang.Object r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    public /* synthetic */ AnnotationEncodeValue(java.lang.Object r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2, p000.AbstractC1067zq r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public final org.luckypray.dexkit.result.AnnotationData annotationValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.value
            r2.getClass()
            org.luckypray.dexkit.result.AnnotationData r2 = (org.luckypray.dexkit.result.AnnotationData) r2
            return r2
        Le:
            java.lang.String r2 = "type is not AnnotationValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.result.AnnotationEncodeArrayData arrayValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.value
            r2.getClass()
            org.luckypray.dexkit.result.AnnotationEncodeArrayData r2 = (org.luckypray.dexkit.result.AnnotationEncodeArrayData) r2
            return r2
        Le:
            java.lang.String r2 = "type is not ArrayValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final boolean boolValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
            if (r0 != r1) goto L12
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L12:
            java.lang.String r2 = "type is not BoolValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final byte byteValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
            if (r0 != r1) goto L12
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            return r2
        L12:
            java.lang.String r2 = "type is not ByteValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final char charValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
            if (r0 != r1) goto L12
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            return r2
        L12:
            java.lang.String r2 = "type is not CharValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final double doubleValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
            if (r0 != r1) goto L12
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.Double r2 = (java.lang.Double) r2
            double r0 = r2.doubleValue()
            return r0
        L12:
            java.lang.String r2 = "type is not DoubleValue"
            p000.C1080.m7279(r2)
            r0 = 0
            return r0
    }

    public final org.luckypray.dexkit.result.FieldData enumValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.value
            r2.getClass()
            org.luckypray.dexkit.result.FieldData r2 = (org.luckypray.dexkit.result.FieldData) r2
            return r2
        Le:
            java.lang.String r2 = "type is not EnumValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final float floatValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
            if (r0 != r1) goto L12
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            return r2
        L12:
            java.lang.String r2 = "type is not FloatValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType getType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r0.type
            return r0
    }

    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.value
            return r0
    }

    public final int intValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue
            if (r0 != r1) goto L12
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L12:
            java.lang.String r2 = "type is not IntValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final boolean isNullValue() {
            r1 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = r1.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final long longValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue
            if (r0 != r1) goto L12
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            return r0
        L12:
            java.lang.String r2 = "type is not LongValue"
            p000.C1080.m7279(r2)
            r0 = 0
            return r0
    }

    public final org.luckypray.dexkit.result.MethodData methodValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.value
            r2.getClass()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            return r2
        Le:
            java.lang.String r2 = "type is not MethodValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final java.lang.Number numberValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            int[] r1 = org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L38;
                case 3: goto L2f;
                case 4: goto L26;
                case 5: goto L1d;
                case 6: goto L14;
                default: goto Ld;
            }
        Ld:
            java.lang.String r2 = "type is not number"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
        L14:
            double r0 = r2.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L1d:
            float r2 = r2.floatValue()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L26:
            long r0 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L2f:
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L38:
            short r2 = r2.shortValue()
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            return r2
        L41:
            byte r2 = r2.byteValue()
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
    }

    public final short shortValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
            if (r0 != r1) goto L12
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.Short r2 = (java.lang.Short) r2
            short r2 = r2.shortValue()
            return r2
        L12:
            java.lang.String r2 = "type is not ShortValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final java.lang.String stringValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.value
            r2.getClass()
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Le:
            java.lang.String r2 = "type is not StringValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = r9.type
            int[] r2 = org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            java.lang.String r2 = "."
            switch(r1) {
                case 7: goto Lc1;
                case 8: goto L7f;
                case 9: goto L66;
                case 10: goto L41;
                case 11: goto L31;
                case 12: goto L22;
                case 13: goto L1b;
                default: goto L14;
            }
        L14:
            java.lang.Object r9 = r9.value
            r0.append(r9)
            goto Lcf
        L1b:
            java.lang.String r9 = "null"
            r0.append(r9)
            goto Lcf
        L22:
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.Object r9 = r9.value
            r0.append(r9)
            r0.append(r1)
            goto Lcf
        L31:
            java.lang.Object r9 = r9.value
            r9.getClass()
            org.luckypray.dexkit.result.AnnotationData r9 = (org.luckypray.dexkit.result.AnnotationData) r9
            java.lang.String r9 = r9.toString()
            r0.append(r9)
            goto Lcf
        L41:
            java.lang.String r1 = "{"
            r0.append(r1)
            java.lang.Object r9 = r9.value
            r9.getClass()
            org.luckypray.dexkit.result.AnnotationEncodeArrayData r9 = (org.luckypray.dexkit.result.AnnotationEncodeArrayData) r9
            java.util.List r1 = r9.getValues()
            r6 = 0
            r7 = 62
            java.lang.String r2 = ", "
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)
            r0.append(r9)
            java.lang.String r9 = "}"
            r0.append(r9)
            goto Lcf
        L66:
            java.lang.Object r9 = r9.value
            r9.getClass()
            org.luckypray.dexkit.result.FieldData r9 = (org.luckypray.dexkit.result.FieldData) r9
            java.lang.String r1 = r9.getTypeName()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r9 = r9.getFieldName()
            r0.append(r9)
            goto Lcf
        L7f:
            java.lang.Object r9 = r9.value
            r9.getClass()
            org.luckypray.dexkit.result.MethodData r9 = (org.luckypray.dexkit.result.MethodData) r9
            java.lang.String r1 = r9.getReturnTypeName()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r9.getClassName()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r9.getMethodName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.util.List r2 = r9.getParamTypeNames()
            r7 = 0
            r8 = 62
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r2, r3, r4, r5, r6, r7, r8)
            r0.append(r9)
            java.lang.String r9 = ")"
            r0.append(r9)
            goto Lcf
        Lc1:
            java.lang.Object r9 = r9.value
            r9.getClass()
            org.luckypray.dexkit.result.ClassData r9 = (org.luckypray.dexkit.result.ClassData) r9
            java.lang.String r9 = r9.getName()
            r0.append(r9)
        Lcf:
            java.lang.String r9 = r0.toString()
            return r9
    }

    public final org.luckypray.dexkit.result.ClassData typeValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.value
            r2.getClass()
            org.luckypray.dexkit.result.ClassData r2 = (org.luckypray.dexkit.result.ClassData) r2
            return r2
        Le:
            java.lang.String r2 = "type is not TypeValue"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }
}
