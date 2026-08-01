.class public final synthetic Lr0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/q;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lr0/q;Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lr0/p;->a:I

    iput-object p1, p0, Lr0/p;->b:Lr0/q;

    iput-object p2, p0, Lr0/p;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr0/p;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lr0/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/p;->b:Lr0/q;

    .line 7
    .line 8
    iget-object v1, p0, Lr0/p;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v2, p0, Lr0/p;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lr0/q;->a(Lr0/q;Ljava/lang/Object;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lr0/p;->b:Lr0/q;

    .line 17
    .line 18
    iget-object v1, p0, Lr0/p;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v2, p0, Lr0/p;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Lr0/q;->a(Lr0/q;Ljava/lang/Object;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
