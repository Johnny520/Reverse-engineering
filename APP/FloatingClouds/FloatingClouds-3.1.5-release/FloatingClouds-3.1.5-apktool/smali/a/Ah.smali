.class public final synthetic La/Ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:La/J8;

.field public final synthetic d:Ltop/mmjz/floatingclouds/XposedEntry;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;I)V
    .locals 0

    iput p4, p0, La/Ah;->a:I

    iput-object p1, p0, La/Ah;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, La/Ah;->c:La/J8;

    iput-object p3, p0, La/Ah;->d:Ltop/mmjz/floatingclouds/XposedEntry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La/Ah;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/Ah;->d:Ltop/mmjz/floatingclouds/XposedEntry;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    iget-object v1, p0, La/Ah;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, La/Ah;->c:La/J8;

    invoke-static {v1, v2, v0, p1}, Ltop/mmjz/floatingclouds/XposedEntry;->b(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La/Ah;->d:Ltop/mmjz/floatingclouds/XposedEntry;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    iget-object v1, p0, La/Ah;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, La/Ah;->c:La/J8;

    invoke-static {v1, v2, v0, p1}, Ltop/mmjz/floatingclouds/XposedEntry;->e(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La/Ah;->d:Ltop/mmjz/floatingclouds/XposedEntry;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    iget-object v1, p0, La/Ah;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, La/Ah;->c:La/J8;

    invoke-static {v1, v2, v0, p1}, Ltop/mmjz/floatingclouds/XposedEntry;->d(Ljava/util/concurrent/atomic/AtomicBoolean;La/J8;Ltop/mmjz/floatingclouds/XposedEntry;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
