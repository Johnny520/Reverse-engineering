.class public final Lorg/luckypray/dexkit/schema/-Number;
.super Ljava/lang/Object;
.source "SourceFile"


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

    new-instance v0, Lorg/luckypray/dexkit/schema/-Number$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-Number$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-Number;->Companion:Lorg/luckypray/dexkit/schema/-Number$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
