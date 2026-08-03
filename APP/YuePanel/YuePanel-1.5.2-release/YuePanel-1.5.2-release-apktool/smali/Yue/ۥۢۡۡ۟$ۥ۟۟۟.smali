.class public LYue/ۥۢۡۡ۟$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1c
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۡ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/text/PrecomputedText;)Ljava/lang/CharSequence;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    return-object p0
.end method

.method public static ۥ۟(Landroid/icu/text/DecimalFormatSymbols;)[Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/icu/text/DecimalFormatSymbols;->getDigitStrings()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/widget/TextView;)Landroid/text/PrecomputedText$Params;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextMetricsParams()Landroid/text/PrecomputedText$Params;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(Landroid/widget/TextView;I)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method
