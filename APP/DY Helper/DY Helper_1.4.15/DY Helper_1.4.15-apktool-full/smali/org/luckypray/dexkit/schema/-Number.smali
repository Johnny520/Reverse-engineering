.class public final Lorg/luckypray/dexkit/schema/-Number;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-Number$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-Number$Companion;

.field public static final EncodeValueByte:B = 0x1t

.field public static final EncodeValueDouble:B = 0x6t

.field public static final EncodeValueFloat:B = 0x5t

.field public static final EncodeValueInt:B = 0x3t

.field public static final EncodeValueLong:B = 0x4t

.field public static final EncodeValueShort:B = 0x2t

.field public static final NONE:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-Number$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-Number$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/schema/-Number;->Companion:Lorg/luckypray/dexkit/schema/-Number$Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
