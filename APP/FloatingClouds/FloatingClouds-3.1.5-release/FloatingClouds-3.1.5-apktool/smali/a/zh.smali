.class public final synthetic La/zh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ltop/mmjz/floatingclouds/XposedEntry;

.field public final synthetic c:La/J8;


# direct methods
.method public synthetic constructor <init>(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;I)V
    .locals 0

    iput p3, p0, La/zh;->a:I

    iput-object p1, p0, La/zh;->b:Ltop/mmjz/floatingclouds/XposedEntry;

    iput-object p2, p0, La/zh;->c:La/J8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, La/zh;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/zh;->b:Ltop/mmjz/floatingclouds/XposedEntry;

    iget-object v1, p0, La/zh;->c:La/J8;

    invoke-static {v0, v1}, Ltop/mmjz/floatingclouds/XposedEntry;->a(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;)V

    return-void

    :pswitch_0
    iget-object v0, p0, La/zh;->b:Ltop/mmjz/floatingclouds/XposedEntry;

    iget-object v1, p0, La/zh;->c:La/J8;

    invoke-static {v0, v1}, Ltop/mmjz/floatingclouds/XposedEntry;->c(Ltop/mmjz/floatingclouds/XposedEntry;La/J8;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
