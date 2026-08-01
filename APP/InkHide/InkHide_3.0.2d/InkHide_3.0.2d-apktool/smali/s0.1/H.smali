.class public final Ls0/H;
.super Landroid/text/style/URLSpan;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ls0/J;


# direct methods
.method public constructor <init>(Ls0/J;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/H;->a:Ls0/J;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "widget"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls0/H;->a:Ls0/J;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "getContext(...)"

    .line 13
    .line 14
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lr0/n1;

    .line 22
    .line 23
    const/16 v2, 0xd

    .line 24
    .line 25
    invoke-direct {v1, v2}, Lr0/n1;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0, v1}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
