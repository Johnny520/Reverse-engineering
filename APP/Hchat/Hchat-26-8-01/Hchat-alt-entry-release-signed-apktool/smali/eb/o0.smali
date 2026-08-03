.class public final synthetic Leb/o0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:[B

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leb/o0;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Leb/o0;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Leb/o0;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Leb/o0;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Leb/o0;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Leb/o0;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput p7, p0, Leb/o0;->m:I

    .line 17
    .line 18
    iput-object p8, p0, Leb/o0;->n:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Leb/o0;->o:[B

    .line 21
    .line 22
    iput-object p10, p0, Leb/o0;->p:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v9, p0, Leb/o0;->p:Ljava/lang/String;

    .line 2
    .line 3
    move-object v10, p1

    .line 4
    check-cast v10, Lj8/p;

    .line 5
    .line 6
    iget-object v0, p0, Leb/o0;->g:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Leb/o0;->h:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Leb/o0;->i:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, p0, Leb/o0;->j:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, p0, Leb/o0;->k:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v5, p0, Leb/o0;->l:Ljava/lang/String;

    .line 17
    .line 18
    iget v6, p0, Leb/o0;->m:I

    .line 19
    .line 20
    iget-object v7, p0, Leb/o0;->n:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v8, p0, Leb/o0;->o:[B

    .line 23
    .line 24
    invoke-static/range {v0 .. v10}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method
