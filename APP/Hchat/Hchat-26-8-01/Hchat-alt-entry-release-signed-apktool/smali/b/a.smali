.class public final Lb/a;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lb/f;


# direct methods
.method public synthetic constructor <init>(Lb/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lb/a;->h:Lb/f;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lb/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb/a;->h:Lb/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb/f;->a()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lb/a;->h:Lb/f;

    .line 15
    .line 16
    invoke-virtual {v0}, Lb/f;->d()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
