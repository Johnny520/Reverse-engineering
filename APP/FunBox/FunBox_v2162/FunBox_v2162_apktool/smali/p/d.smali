.class final Lp/d;
.super Lfun/box001/shared/hook/XHooker$HookParam;
.source "SourceFile"


# instance fields
.field final synthetic a:[Z

.field final synthetic b:[Ljava/lang/Object;

.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Lfun/box001/shared/hook/XHooker$HookCallback;

.field final synthetic e:[Ljava/lang/Throwable;


# direct methods
.method constructor <init>([Z[Ljava/lang/Object;Ljava/util/ArrayList;Lfun/box001/shared/hook/XHooker$HookCallback;[Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lp/d;->a:[Z

    iput-object p2, p0, Lp/d;->b:[Ljava/lang/Object;

    iput-object p3, p0, Lp/d;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lp/d;->d:Lfun/box001/shared/hook/XHooker$HookCallback;

    iput-object p5, p0, Lp/d;->e:[Ljava/lang/Throwable;

    invoke-direct {p0}, Lfun/box001/shared/hook/XHooker$HookParam;-><init>()V

    return-void
.end method


# virtual methods
.method public final getResult()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getThrowable()Ljava/lang/Throwable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final setResult(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lp/d;->a:[Z

    const/4 v2, 0x0

    aput-boolean v0, v1, v2

    iget-object v0, p0, Lp/d;->b:[Ljava/lang/Object;

    aput-object p1, v0, v2

    return-void
.end method

.method public final setThrowable(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lp/d;->a:[Z

    const/4 v2, 0x0

    aput-boolean v0, v1, v2

    iget-object v0, p0, Lp/d;->e:[Ljava/lang/Throwable;

    aput-object p1, v0, v2

    return-void
.end method

.method public final unhook()V
    .locals 2

    iget-object v0, p0, Lp/d;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lp/d;->d:Lfun/box001/shared/hook/XHooker$HookCallback;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
