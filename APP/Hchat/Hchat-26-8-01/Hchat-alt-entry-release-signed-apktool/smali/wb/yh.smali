.class public final synthetic Lwb/yh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/yh;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/yh;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/yh;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/yh;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/yh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/yh;->i:Li0/a1;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/yh;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "rename"

    .line 14
    .line 15
    iget-object v1, p0, Lwb/yh;->j:Li0/a1;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v1, Lwb/v0;

    .line 24
    .line 25
    iget-object v0, p0, Lwb/yh;->i:Li0/a1;

    .line 26
    .line 27
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lua/i;

    .line 32
    .line 33
    iget v2, v2, Lua/i;->i:I

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    if-ne v2, v3, :cond_0

    .line 37
    .line 38
    const-string v2, "\u9009\u62e9\u767d\u540d\u5355"

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const-string v2, "\u9009\u62e9\u9ed1\u540d\u5355"

    .line 42
    .line 43
    :goto_1
    new-instance v6, Lwb/ni;

    .line 44
    .line 45
    const/16 v3, 0x12

    .line 46
    .line 47
    invoke-direct {v6, v0, v3}, Lwb/ni;-><init>(Li0/a1;I)V

    .line 48
    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    const/16 v8, 0xc0

    .line 52
    .line 53
    sget-object v3, Lwb/u0;->i:Lwb/u0;

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    iget-object v5, p0, Lwb/yh;->h:Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct/range {v1 .. v8}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lwb/yh;->j:Li0/a1;

    .line 62
    .line 63
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
