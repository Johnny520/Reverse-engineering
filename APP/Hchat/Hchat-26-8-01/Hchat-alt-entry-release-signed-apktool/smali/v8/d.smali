.class public final synthetic Lv8/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lv8/q;

.field public final synthetic i:Lv8/h;

.field public final synthetic j:Lv8/f;

.field public final synthetic k:Lgg/s;


# direct methods
.method public synthetic constructor <init>(Lv8/q;Lv8/h;Lv8/f;Lgg/s;I)V
    .locals 0

    .line 1
    iput p5, p0, Lv8/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lv8/d;->h:Lv8/q;

    .line 4
    .line 5
    iput-object p2, p0, Lv8/d;->i:Lv8/h;

    .line 6
    .line 7
    iput-object p3, p0, Lv8/d;->j:Lv8/f;

    .line 8
    .line 9
    iput-object p4, p0, Lv8/d;->k:Lgg/s;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lv8/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv8/d;->k:Lgg/s;

    .line 7
    .line 8
    iget v0, v0, Lgg/s;->g:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iget-object v1, p0, Lv8/d;->h:Lv8/q;

    .line 13
    .line 14
    iget-object v2, p0, Lv8/d;->i:Lv8/h;

    .line 15
    .line 16
    iget-object v3, p0, Lv8/d;->j:Lv8/f;

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3, v0}, Lv8/q;->q(Lv8/h;Lv8/f;I)V

    .line 19
    .line 20
    .line 21
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    iget-object v0, p0, Lv8/d;->k:Lgg/s;

    .line 25
    .line 26
    iget v0, v0, Lgg/s;->g:I

    .line 27
    .line 28
    iget-object v1, p0, Lv8/d;->h:Lv8/q;

    .line 29
    .line 30
    iget-object v2, p0, Lv8/d;->i:Lv8/h;

    .line 31
    .line 32
    iget-object v3, p0, Lv8/d;->j:Lv8/f;

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3, v0}, Lv8/q;->q(Lv8/h;Lv8/f;I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
