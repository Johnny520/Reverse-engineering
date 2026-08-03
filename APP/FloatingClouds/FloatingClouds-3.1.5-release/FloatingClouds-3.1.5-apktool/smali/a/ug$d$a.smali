.class public final La/ug$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/ug$d;->u(Landroid/view/View;La/Tb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:La/nh;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:La/Tb;


# direct methods
.method public constructor <init>(Landroid/view/View;La/Tb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, La/ug$d$a;->b:Landroid/view/View;

    iput-object p2, p0, La/ug$d$a;->c:La/Tb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/ug$d$a;->a:La/nh;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    invoke-static {p1, p2}, La/nh;->g(Landroid/view/View;Landroid/view/WindowInsets;)La/nh;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v2, p0, La/ug$d$a;->c:La/Tb;

    const/16 v3, 0x1e

    if-ge v1, v3, :cond_0

    iget-object v4, p0, La/ug$d$a;->b:Landroid/view/View;

    invoke-static {p2, v4}, La/ug$d;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, La/ug$d$a;->a:La/nh;

    invoke-virtual {v0, p2}, La/nh;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {v2, p1, v0}, La/Tb;->a(Landroid/view/View;La/nh;)La/nh;

    move-result-object p1

    invoke-virtual {p1}, La/nh;->f()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object v0, p0, La/ug$d$a;->a:La/nh;

    invoke-interface {v2, p1, v0}, La/Tb;->a(Landroid/view/View;La/nh;)La/nh;

    move-result-object p2

    if-lt v1, v3, :cond_1

    invoke-virtual {p2}, La/nh;->f()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, La/ug$c;->c(Landroid/view/View;)V

    invoke-virtual {p2}, La/nh;->f()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
