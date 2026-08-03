.class public abstract LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 2
    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    .line 3
    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    .line 4
    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, LYue/ۥۡۢۤۨ;->ۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;->ۥ:Ljava/lang/String;

    .line 6
    const-string p1, "\'"

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 7
    :cond_0
    const-string p1, "\""

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 8
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    :cond_3
    if-eqz p3, :cond_4

    .line 9
    invoke-static {p2}, LYue/ۥۡۢۤۨ;->ۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    invoke-static {p2, p1}, LYue/ۥۡۢۤۨ;->ۥ۟۟(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    :goto_1
    iput-object p1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    return-void
.end method
