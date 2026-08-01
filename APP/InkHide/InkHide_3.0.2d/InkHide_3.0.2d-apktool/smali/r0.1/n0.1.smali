.class public final synthetic Lr0/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/H0;

.field public final synthetic c:LN0/l;


# direct methods
.method public synthetic constructor <init>(Lr0/H0;LN0/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/n0;->a:I

    iput-object p1, p0, Lr0/n0;->b:Lr0/H0;

    iput-object p2, p0, Lr0/n0;->c:LN0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lr0/n0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/n0;->c:LN0/l;

    .line 7
    .line 8
    iget-object v0, v0, LN0/l;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v1, p0, Lr0/n0;->b:Lr0/H0;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lr0/H0;->g1(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, LE0/i;->a:LE0/i;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lr0/n0;->c:LN0/l;

    .line 19
    .line 20
    iget-object v0, v0, LN0/l;->a:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v1, p0, Lr0/n0;->b:Lr0/H0;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lr0/H0;->g1(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, LE0/i;->a:LE0/i;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
