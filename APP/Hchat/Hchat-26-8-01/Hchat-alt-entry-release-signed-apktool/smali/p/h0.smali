.class public final synthetic Lp/h0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lv1/b1;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lv1/b1;III)V
    .locals 0

    .line 1
    iput p4, p0, Lp/h0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lp/h0;->h:Lv1/b1;

    .line 4
    .line 5
    iput p2, p0, Lp/h0;->i:I

    .line 6
    .line 7
    iput p3, p0, Lp/h0;->j:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lp/h0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lp/h0;->j:I

    .line 7
    .line 8
    check-cast p1, Lv1/a1;

    .line 9
    .line 10
    iget-object v1, p0, Lp/h0;->h:Lv1/b1;

    .line 11
    .line 12
    iget v2, p0, Lp/h0;->i:I

    .line 13
    .line 14
    invoke-static {p1, v1, v2, v0}, Lv1/a1;->B(Lv1/a1;Lv1/b1;II)V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    iget v0, p0, Lp/h0;->j:I

    .line 21
    .line 22
    check-cast p1, Lv1/a1;

    .line 23
    .line 24
    iget-object v1, p0, Lp/h0;->h:Lv1/b1;

    .line 25
    .line 26
    iget v2, p0, Lp/h0;->i:I

    .line 27
    .line 28
    invoke-static {p1, v1, v2, v0}, Lv1/a1;->B(Lv1/a1;Lv1/b1;II)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
