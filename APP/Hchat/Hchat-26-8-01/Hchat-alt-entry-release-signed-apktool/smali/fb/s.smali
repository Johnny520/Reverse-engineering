.class public final synthetic Lfb/s;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic n:Lgg/u;

.field public final synthetic o:Lwb/qb;

.field public final synthetic p:Lgg/u;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lgg/u;


# direct methods
.method public constructor <init>(Lgg/u;Lwb/qb;Lgg/u;Ljava/lang/String;Lgg/u;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lfb/s;->n:Lgg/u;

    .line 2
    .line 3
    iput-object p2, p0, Lfb/s;->o:Lwb/qb;

    .line 4
    .line 5
    iput-object p3, p0, Lfb/s;->p:Lgg/u;

    .line 6
    .line 7
    iput-object p4, p0, Lfb/s;->q:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lfb/s;->r:Lgg/u;

    .line 10
    .line 11
    const-class p1, Lgg/k;

    .line 12
    .line 13
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v4, "generate_hUnOzRk$lambda$0$updateProtocolTranscript(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;)V"

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v1, 0x1

    .line 21
    const-string v3, "updateProtocolTranscript"

    .line 22
    .line 23
    move-object v0, p0

    .line 24
    invoke-direct/range {v0 .. v5}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Ljava/lang/String;

    .line 3
    .line 4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v3, p0, Lfb/s;->q:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lfb/s;->r:Lgg/u;

    .line 10
    .line 11
    iget-object v0, p0, Lfb/s;->n:Lgg/u;

    .line 12
    .line 13
    iget-object v1, p0, Lfb/s;->o:Lwb/qb;

    .line 14
    .line 15
    iget-object v2, p0, Lfb/s;->p:Lgg/u;

    .line 16
    .line 17
    invoke-static/range {v0 .. v5}, Lfb/u;->P(Lgg/u;Lwb/qb;Lgg/u;Ljava/lang/String;Lgg/u;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    return-object p1
.end method
