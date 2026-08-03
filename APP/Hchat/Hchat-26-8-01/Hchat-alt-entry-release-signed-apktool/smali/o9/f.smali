.class public final synthetic Lo9/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lo9/p;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lo9/n;

.field public final synthetic l:Lo9/q;


# direct methods
.method public synthetic constructor <init>(Lo9/p;Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;I)V
    .locals 0

    .line 1
    iput p6, p0, Lo9/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lo9/f;->h:Lo9/p;

    .line 4
    .line 5
    iput-object p2, p0, Lo9/f;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lo9/f;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lo9/f;->k:Lo9/n;

    .line 10
    .line 11
    iput-object p5, p0, Lo9/f;->l:Lo9/q;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lo9/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo9/f;->k:Lo9/n;

    .line 7
    .line 8
    iget-object v1, p0, Lo9/f;->l:Lo9/q;

    .line 9
    .line 10
    iget-object v2, p0, Lo9/f;->h:Lo9/p;

    .line 11
    .line 12
    iget-object v3, p0, Lo9/f;->i:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, p0, Lo9/f;->j:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v2, v3, v4, v0, v1}, Lo9/p;->E(Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lo9/f;->k:Lo9/n;

    .line 23
    .line 24
    iget-object v1, p0, Lo9/f;->l:Lo9/q;

    .line 25
    .line 26
    iget-object v2, p0, Lo9/f;->h:Lo9/p;

    .line 27
    .line 28
    iget-object v3, p0, Lo9/f;->i:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v4, p0, Lo9/f;->j:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2, v3, v4, v0, v1}, Lo9/p;->D(Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_1
    iget-object v0, p0, Lo9/f;->k:Lo9/n;

    .line 37
    .line 38
    iget-object v1, p0, Lo9/f;->l:Lo9/q;

    .line 39
    .line 40
    iget-object v2, p0, Lo9/f;->h:Lo9/p;

    .line 41
    .line 42
    iget-object v3, p0, Lo9/f;->i:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, p0, Lo9/f;->j:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2, v3, v4, v0, v1}, Lo9/p;->E(Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_2
    iget-object v0, p0, Lo9/f;->k:Lo9/n;

    .line 51
    .line 52
    iget-object v1, p0, Lo9/f;->l:Lo9/q;

    .line 53
    .line 54
    iget-object v2, p0, Lo9/f;->h:Lo9/p;

    .line 55
    .line 56
    iget-object v3, p0, Lo9/f;->i:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v4, p0, Lo9/f;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v2, v3, v4, v0, v1}, Lo9/p;->D(Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
