.class public final Lf0/e0;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/ClassLoader;I)V
    .locals 0

    iput p3, p0, Lf0/e0;->b:I

    sget-object p2, Lf0/f0;->a:Lf0/f0;

    iput-object p1, p0, Lf0/e0;->c:Ljava/lang/Class;

    packed-switch p3, :pswitch_data_0

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_0
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_1
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_2
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 3

    const-string v0, "thisObject"

    iget-object v1, p0, Lf0/e0;->c:Ljava/lang/Class;

    iget v2, p0, Lf0/e0;->b:I

    packed-switch v2, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v2, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf0/f0;->a:Lf0/f0;

    invoke-static {p1}, Lf0/f0;->f(Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v2, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf0/f0;->a:Lf0/f0;

    invoke-static {p1}, Lf0/f0;->f(Ljava/lang/Object;)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 3

    iget-object v0, p0, Lf0/e0;->c:Ljava/lang/Class;

    const-string v1, "thisObject"

    iget v2, p0, Lf0/e0;->b:I

    packed-switch v2, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lf0/f0;->b(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lf0/f0;->a:Lf0/f0;

    invoke-static {p1}, Lf0/f0;->f(Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lf0/f0;->b(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v0, Lf0/f0;->a:Lf0/f0;

    invoke-static {p1}, Lf0/f0;->f(Ljava/lang/Object;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
