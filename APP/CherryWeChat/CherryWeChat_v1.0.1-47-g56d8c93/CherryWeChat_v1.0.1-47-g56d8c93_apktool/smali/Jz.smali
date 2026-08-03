.class public final LJz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# static fields
.field public static final d:[Ljava/lang/Class;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Landroid/view/MenuItem;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    sput-object v0, LJz;->d:[Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LJz;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lha;Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LJz;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LJz;->b:Ljava/lang/Object;

    iput-object p2, p0, LJz;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lur;Landroid/view/MenuItem$OnMenuItemClickListener;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LJz;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJz;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LJz;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 6

    iget v0, p0, LJz;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LJz;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/MenuItem$OnMenuItemClickListener;

    iget-object v1, p0, LJz;->c:Ljava/lang/Object;

    check-cast v1, Lur;

    invoke-virtual {v1, p1}, LB3;->i(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :pswitch_0
    const-wide v0, -0x5042fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p0, LJz;->b:Ljava/lang/Object;

    check-cast p1, Lha;

    iget-object v0, p0, LJz;->c:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    const-wide v1, -0x5cc8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x5ccdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x5c9afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LP3;

    const/16 v5, 0xb

    invoke-direct {v4, v5, v0, p1}, LP3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1, v2, v3, v4}, Lgf;->P(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd;)V

    const/4 p1, 0x1

    return p1

    :pswitch_1
    iget-object v0, p0, LJz;->b:Ljava/lang/Object;

    iget-object v1, p0, LJz;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Method;

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    :goto_0
    return p1

    :goto_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
