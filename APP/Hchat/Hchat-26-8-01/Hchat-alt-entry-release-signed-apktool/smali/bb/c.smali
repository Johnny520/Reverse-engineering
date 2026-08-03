.class public final synthetic Lbb/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lbb/e;


# direct methods
.method public synthetic constructor <init>(Lbb/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbb/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lbb/c;->h:Lbb/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lbb/c;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lbb/c;->h:Lbb/e;

    .line 12
    .line 13
    iget-object v0, v0, Lbb/e;->e:Lbb/g;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lbb/g;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lbb/c;->h:Lbb/e;

    .line 27
    .line 28
    iget-object v0, v0, Lbb/e;->e:Lbb/g;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lbb/g;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 36
    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
