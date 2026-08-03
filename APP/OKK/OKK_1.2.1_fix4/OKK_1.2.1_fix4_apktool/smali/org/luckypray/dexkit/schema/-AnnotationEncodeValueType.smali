.class public final Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueType$Companion;
    }
.end annotation


# static fields
.field public static final AnnotationValue:B = 0xct

.field public static final ArrayValue:B = 0xbt

.field public static final BoolValue:B = 0xet

.field public static final ByteValue:B = 0x0t

.field public static final CharValue:B = 0x2t

.field public static final Companion:Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueType$Companion;

.field public static final DoubleValue:B = 0x6t

.field public static final EnumValue:B = 0xat

.field public static final FloatValue:B = 0x5t

.field public static final IntValue:B = 0x3t

.field public static final LongValue:B = 0x4t

.field public static final MethodValue:B = 0x9t

.field public static final NullValue:B = 0xdt

.field public static final ShortValue:B = 0x1t

.field public static final StringValue:B = 0x7t

.field public static final TypeValue:B = 0x8t


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueType$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueType;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueType$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
