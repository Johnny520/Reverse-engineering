.class public abstract LXo;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ltc;


# instance fields
.field public final a:Z

.field public final b:Landroid/net/Uri;

.field public final c:Landroid/content/ContentResolver;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXo;->c:Landroid/content/ContentResolver;

    iput-object p2, p0, LXo;->b:Landroid/net/Uri;

    iput-boolean p3, p0, LXo;->a:Z

    return-void
.end method


# virtual methods
.method public abstract b(Ljava/lang/Object;)V
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LXo;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, LXo;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final d(Lwu;Lsc;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, LXo;->b:Landroid/net/Uri;

    iget-object v0, p0, LXo;->c:Landroid/content/ContentResolver;

    invoke-virtual {p0, v0, p1}, LXo;->e(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LXo;->d:Ljava/lang/Object;

    invoke-interface {p2, p1}, Lsc;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Lsc;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method public abstract e(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
