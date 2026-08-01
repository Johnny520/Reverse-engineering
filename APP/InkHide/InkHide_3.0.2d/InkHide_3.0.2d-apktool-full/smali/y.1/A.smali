.class public final Ly/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public a:Ly/g0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Ly/p;


# direct methods
.method public constructor <init>(Landroid/view/View;Ly/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ly/A;->b:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Ly/A;->c:Ly/p;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Ly/A;->a:Ly/g0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    .line 1
    invoke-static {p2, p1}, Ly/g0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Ly/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    iget-object v2, p0, Ly/A;->c:Ly/p;

    .line 8
    .line 9
    const/16 v3, 0x1e

    .line 10
    .line 11
    if-ge v1, v3, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Ly/A;->b:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {p2, v4}, Ly/B;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Ly/A;->a:Ly/g0;

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ly/g0;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    check-cast v2, Le/m;

    .line 27
    .line 28
    invoke-virtual {v2, p1, v0}, Le/m;->a(Landroid/view/View;Ly/g0;)Ly/g0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ly/g0;->b()Landroid/view/WindowInsets;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    iput-object v0, p0, Ly/A;->a:Ly/g0;

    .line 38
    .line 39
    check-cast v2, Le/m;

    .line 40
    .line 41
    invoke-virtual {v2, p1, v0}, Le/m;->a(Landroid/view/View;Ly/g0;)Ly/g0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-lt v1, v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {p2}, Ly/g0;->b()Landroid/view/WindowInsets;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_1
    invoke-static {p1}, Ly/z;->c(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ly/g0;->b()Landroid/view/WindowInsets;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method
