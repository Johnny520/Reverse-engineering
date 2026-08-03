.class public final synthetic Lr9/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Lr9/d0;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:[Ljava/lang/Object;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lr9/d0;Ljava/lang/Object;[Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/d;->g:Lr9/d0;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/d;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lr9/d;->i:[Ljava/lang/Object;

    .line 9
    .line 10
    iput p4, p0, Lr9/d;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lr9/d;->k:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lr9/d;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Lr9/d;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lr9/d;->g:Lr9/d0;

    .line 6
    .line 7
    iget-object v3, p0, Lr9/d;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lr9/d;->i:[Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v3, v1, v4}, Lr9/d0;->g(ILjava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    return-object v0
.end method
