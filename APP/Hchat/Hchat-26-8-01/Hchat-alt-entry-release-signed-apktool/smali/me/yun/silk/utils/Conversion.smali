.class public final Lme/yun/silk/utils/Conversion;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/yun/silk/utils/Conversion$Companion;,
        Lme/yun/silk/utils/Conversion$ConversionCallback;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lme/yun/silk/utils/Conversion$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lme/yun/silk/utils/Conversion$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lme/yun/silk/utils/Conversion$Companion;-><init>(Lgg/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final m4aToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lme/yun/silk/utils/Conversion$Companion;->m4aToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final m4aToSilk(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    sget-object v0, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lme/yun/silk/utils/Conversion$Companion;->m4aToSilk(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final pcmToAac(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 1

    .line 1
    sget-object v0, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lme/yun/silk/utils/Conversion$Companion;->pcmToAac(Ljava/lang/String;Ljava/lang/String;II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final pcmToM4a(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 1

    .line 1
    sget-object v0, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lme/yun/silk/utils/Conversion$Companion;->pcmToM4a(Ljava/lang/String;Ljava/lang/String;II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final silkToAac(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    sget-object v0, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lme/yun/silk/utils/Conversion$Companion;->silkToAac(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final silkToM4a(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    sget-object v0, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lme/yun/silk/utils/Conversion$Companion;->silkToM4a(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final startTransform(Lme/yun/silk/SilkCodec;ILjava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V
    .locals 7

    .line 1
    sget-object v0, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move v5, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-virtual/range {v0 .. v6}, Lme/yun/silk/utils/Conversion$Companion;->startTransform(Lme/yun/silk/SilkCodec;ILjava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
