.class public final synthetic Lr0/J1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/M1;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lr0/M1;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/J1;->a:I

    iput-object p1, p0, Lr0/J1;->b:Lr0/M1;

    iput-object p2, p0, Lr0/J1;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lr0/J1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/J1;->b:Lr0/M1;

    .line 7
    .line 8
    iget-object v1, p0, Lr0/J1;->c:Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lr0/M1;->a(Lr0/M1;Landroid/app/Activity;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lr0/J1;->b:Lr0/M1;

    .line 15
    .line 16
    iget-object v1, p0, Lr0/J1;->c:Landroid/app/Activity;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lr0/M1;->a(Lr0/M1;Landroid/app/Activity;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
