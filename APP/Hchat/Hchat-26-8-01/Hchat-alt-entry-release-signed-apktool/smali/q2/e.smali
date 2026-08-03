.class public final synthetic Lq2/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lq2/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lq2/e;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-wide p2, p0, Lq2/e;->h:J

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lq2/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq2/e;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/l;

    .line 9
    .line 10
    iget-wide v1, p0, Lq2/e;->h:J

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lq2/e;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lf1/s;

    .line 25
    .line 26
    iget-wide v1, p0, Lq2/e;->h:J

    .line 27
    .line 28
    check-cast v0, Lf1/p0;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lf1/p0;->b(J)Landroid/graphics/Shader;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
