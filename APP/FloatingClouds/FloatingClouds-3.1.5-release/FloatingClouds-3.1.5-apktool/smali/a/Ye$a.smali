.class public final La/Ye$a;
.super La/a2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Ye;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/Ye;


# direct methods
.method public constructor <init>(La/Ye;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Ye$a;->a:La/Ye;

    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 1

    const/4 p1, 0x1

    iget-object v0, p0, La/Ye$a;->a:La/Ye;

    iput-boolean p1, v0, La/Ye;->d:Z

    iget-object p1, v0, La/Ye;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/Ye$b;

    if-eqz p1, :cond_0

    invoke-interface {p1}, La/Ye$b;->a()V

    :cond_0
    return-void
.end method

.method public final e(Landroid/graphics/Typeface;Z)V
    .locals 0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iget-object p2, p0, La/Ye$a;->a:La/Ye;

    iput-boolean p1, p2, La/Ye;->d:Z

    iget-object p1, p2, La/Ye;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/Ye$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, La/Ye$b;->a()V

    :cond_1
    :goto_0
    return-void
.end method
