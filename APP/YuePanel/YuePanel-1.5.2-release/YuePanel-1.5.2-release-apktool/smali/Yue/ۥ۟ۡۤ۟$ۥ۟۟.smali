.class public LYue/ۥ۟ۡۤ۟$ۥ۟۟;
.super LYue/ۥ۟ۡۤ۟$ۥ۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1d
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۡۤ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۡۤ۟$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/text/StaticLayout$Builder;Landroid/widget/TextView;)V
    .locals 0

    invoke-static {p2}, LYue/ۥ۟ۡۤ۠;->ۥ(Landroid/widget/TextView;)Landroid/text/TextDirectionHeuristic;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    return-void
.end method

.method public ۥ۟(Landroid/widget/TextView;)Z
    .locals 0

    invoke-static {p1}, LYue/ۥ۟ۡۤۡ;->ۥ(Landroid/widget/TextView;)Z

    move-result p1

    return p1
.end method
