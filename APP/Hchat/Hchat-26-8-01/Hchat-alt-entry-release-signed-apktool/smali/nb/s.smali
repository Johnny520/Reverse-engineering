.class public final synthetic Lnb/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lnb/w;

.field public final synthetic i:Lnb/o;


# direct methods
.method public synthetic constructor <init>(Lnb/w;Lnb/o;I)V
    .locals 0

    .line 1
    iput p3, p0, Lnb/s;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lnb/s;->h:Lnb/w;

    .line 4
    .line 5
    iput-object p2, p0, Lnb/s;->i:Lnb/o;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lnb/s;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnb/s;->i:Lnb/o;

    .line 7
    .line 8
    const-string v1, "\u5fae\u4fe1\u539f\u751f\u8bed\u97f3\u64ad\u653e\u5668\u64ad\u653e\u5931\u8d25"

    .line 9
    .line 10
    iget-object v2, p0, Lnb/s;->h:Lnb/w;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lnb/w;->b(Lnb/w;Lnb/o;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lnb/s;->i:Lnb/o;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iget-object v2, p0, Lnb/s;->h:Lnb/w;

    .line 20
    .line 21
    invoke-static {v2, v0, v1}, Lnb/w;->b(Lnb/w;Lnb/o;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
