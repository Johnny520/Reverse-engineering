.class public LYue/ۥۣۢ۠ۦ$ۥ۟۟;
.super LYue/ۥۣۢ۠ۦ$ۥ۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1c
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢ۠ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣۢ۠ۦ$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/CharSequence;)Z
    .locals 1

    invoke-static {p1}, LYue/ۥۡۤۥۢ;->ۥ(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    instance-of p1, p1, LYue/ۥۡۤۦ۟;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
