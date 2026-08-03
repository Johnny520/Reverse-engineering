.class final Lp/e;
.super Lfun/box001/shared/hook/XHooker$HookParam;
.source "SourceFile"


# instance fields
.field final synthetic a:[Ljava/lang/Object;

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lfun/box001/shared/hook/XHooker$HookCallback;

.field final synthetic d:[Ljava/lang/Throwable;


# direct methods
.method constructor <init>([Ljava/lang/Object;Ljava/util/ArrayList;Lfun/box001/shared/hook/XHooker$HookCallback;[Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lp/e;->a:[Ljava/lang/Object;

    iput-object p2, p0, Lp/e;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lp/e;->c:Lfun/box001/shared/hook/XHooker$HookCallback;

    iput-object p4, p0, Lp/e;->d:[Ljava/lang/Throwable;

    invoke-direct {p0}, Lfun/box001/shared/hook/XHooker$HookParam;-><init>()V

    return-void
.end method


# virtual methods
.method public final getResult()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lp/e;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final getThrowable()Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lp/e;->d:[Ljava/lang/Throwable;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final setResult(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lp/e;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lp/e;->setThrowable(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setThrowable(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lp/e;->d:[Ljava/lang/Throwable;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public final unhook()V
    .locals 2

    iget-object v0, p0, Lp/e;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lp/e;->c:Lfun/box001/shared/hook/XHooker$HookCallback;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
