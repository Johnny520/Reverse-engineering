.class public final synthetic Leb/r0;
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

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:[B

.field public final synthetic n:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;I)V
    .locals 0

    .line 1
    iput p8, p0, Leb/r0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Leb/r0;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Leb/r0;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Leb/r0;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Leb/r0;->k:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p5, p0, Leb/r0;->l:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p6, p0, Leb/r0;->m:[B

    .line 14
    .line 15
    iput-object p7, p0, Leb/r0;->n:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Leb/r0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v7, p0, Leb/r0;->n:Ljava/lang/String;

    .line 7
    .line 8
    move-object v8, p1

    .line 9
    check-cast v8, Lj8/p;

    .line 10
    .line 11
    iget-object v1, p0, Leb/r0;->h:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Leb/r0;->i:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Leb/r0;->j:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, p0, Leb/r0;->k:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v5, p0, Leb/r0;->l:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, Leb/r0;->m:[B

    .line 22
    .line 23
    invoke-static/range {v1 .. v8}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :pswitch_0
    iget-object v6, p0, Leb/r0;->n:Ljava/lang/String;

    .line 33
    .line 34
    move-object v7, p1

    .line 35
    check-cast v7, Lj8/p;

    .line 36
    .line 37
    iget-object v0, p0, Leb/r0;->h:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p0, Leb/r0;->i:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, p0, Leb/r0;->j:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v3, p0, Leb/r0;->k:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, Leb/r0;->l:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v5, p0, Leb/r0;->m:[B

    .line 48
    .line 49
    invoke-static/range {v0 .. v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
