.class public LYue/ۥۣۡۢۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۤ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۡۢۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/Appendable;

.field public final ۥ۟:LYue/ۥ۠۟ۧۥ$ۥ;


# direct methods
.method public constructor <init>(Ljava/lang/Appendable;LYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۢۤ$ۥ;->ۥ:Ljava/lang/Appendable;

    iput-object p2, p0, LYue/ۥۣۡۢۤ$ۥ;->ۥ۟:LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {p2}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠۠()Ljava/nio/charset/CharsetEncoder;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣۡۢۤ;I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LYue/ۥۣۡۢۤ$ۥ;->ۥ:Ljava/lang/Appendable;

    iget-object v1, p0, LYue/ۥۣۡۢۤ$ۥ;->ۥ۟:LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {p1, v0, p2, v1}, LYue/ۥۣۡۢۤ;->ۥۣۣ۟۟(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, LYue/ۥۡۨۢۨ;

    invoke-direct {p2, p1}, LYue/ۥۡۨۢۨ;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public ۥ۟(LYue/ۥۣۡۢۤ;I)V
    .locals 2

    invoke-virtual {p1}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, LYue/ۥۣۡۢۤ$ۥ;->ۥ:Ljava/lang/Appendable;

    iget-object v1, p0, LYue/ۥۣۡۢۤ$ۥ;->ۥ۟:LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {p1, v0, p2, v1}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۤ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, LYue/ۥۡۨۢۨ;

    invoke-direct {p2, p1}, LYue/ۥۡۨۢۨ;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    :goto_0
    return-void
.end method
