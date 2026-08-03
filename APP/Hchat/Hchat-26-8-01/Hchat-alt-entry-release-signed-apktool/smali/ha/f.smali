.class public final synthetic Lha/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lha/h;

.field public final synthetic i:Lha/g;


# direct methods
.method public synthetic constructor <init>(Lha/h;Lha/g;I)V
    .locals 0

    .line 1
    iput p3, p0, Lha/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lha/f;->h:Lha/h;

    .line 4
    .line 5
    iput-object p2, p0, Lha/f;->i:Lha/g;

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
    .locals 2

    .line 1
    iget v0, p0, Lha/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lha/f;->h:Lha/h;

    .line 7
    .line 8
    iget-object v1, p0, Lha/f;->i:Lha/g;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lha/h;->c(Lha/g;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lha/f;->h:Lha/h;

    .line 15
    .line 16
    iget-object v1, p0, Lha/f;->i:Lha/g;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lha/h;->c(Lha/g;)V

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
