.class public final La/W3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/W3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/W3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/view/ContentInfo$Builder;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p2}, La/t2;->e(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, La/W3$a;->a:Landroid/view/ContentInfo$Builder;

    return-void
.end method


# virtual methods
.method public final a()La/W3;
    .locals 3

    new-instance v0, La/W3;

    new-instance v1, La/W3$d;

    iget-object v2, p0, La/W3$a;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, La/t2;->f(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, La/W3$d;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, La/W3;-><init>(La/W3$e;)V

    return-object v0
.end method

.method public final b(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, La/W3$a;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, La/t2;->j(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    return-void
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, La/W3$a;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, La/t2;->i(Landroid/view/ContentInfo$Builder;I)V

    return-void
.end method

.method public final setExtras(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, La/W3$a;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, La/t2;->k(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    return-void
.end method
