.class public final Lf0/b0;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/ClassLoader;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lf0/b0;->b:I

    iput-object p1, p0, Lf0/b0;->c:Ljava/lang/ClassLoader;

    iput-object p2, p0, Lf0/b0;->d:Ljava/lang/String;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/robv/android/xposed/b;)V
    .locals 4

    iget-object v0, p0, Lf0/b0;->c:Ljava/lang/ClassLoader;

    iget-object v1, p0, Lf0/b0;->d:Ljava/lang/String;

    const/4 v2, 0x0

    iget v3, p0, Lf0/b0;->b:I

    packed-switch v3, :pswitch_data_0

    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v3, "args"

    invoke-static {p1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LE0/j;->m0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v3, p1, Landroid/content/Context;

    if-eqz v3, :cond_0

    move-object v2, p1

    check-cast v2, Landroid/content/Context;

    :cond_0
    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lf0/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v3, "Tinker.onBaseContextAttached("

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v0, p1}, Lf0/c0;->a(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v3, p1, Landroid/app/Application;

    if-eqz v3, :cond_2

    move-object v2, p1

    check-cast v2, Landroid/app/Application;

    :cond_2
    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v3, "com.tencent.mm"

    invoke-static {p1, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    sget-object p1, Lf0/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    move-object v0, p1

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".onCreate"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v0, p1}, Lf0/c0;->a(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
