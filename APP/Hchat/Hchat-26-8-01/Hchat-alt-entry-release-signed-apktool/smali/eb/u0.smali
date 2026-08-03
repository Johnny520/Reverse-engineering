.class public final synthetic Leb/u0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:[B

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;I)V
    .locals 0

    .line 1
    iput p7, p0, Leb/u0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Leb/u0;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Leb/u0;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Leb/u0;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Leb/u0;->k:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p5, p0, Leb/u0;->l:[B

    .line 12
    .line 13
    iput-object p6, p0, Leb/u0;->m:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Leb/u0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v6, p0, Leb/u0;->m:Ljava/lang/String;

    .line 7
    .line 8
    move-object v7, p1

    .line 9
    check-cast v7, Lj8/p;

    .line 10
    .line 11
    iget-object v1, p0, Leb/u0;->h:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Leb/u0;->i:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Leb/u0;->j:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, p0, Leb/u0;->k:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v5, p0, Leb/u0;->l:[B

    .line 20
    .line 21
    invoke-static/range {v1 .. v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :pswitch_0
    iget-object v5, p0, Leb/u0;->m:Ljava/lang/String;

    .line 31
    .line 32
    move-object v6, p1

    .line 33
    check-cast v6, Lj8/p;

    .line 34
    .line 35
    iget-object v0, p0, Leb/u0;->h:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p0, Leb/u0;->i:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, p0, Leb/u0;->j:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v3, p0, Leb/u0;->k:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, Leb/u0;->l:[B

    .line 44
    .line 45
    invoke-static/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    goto :goto_0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
