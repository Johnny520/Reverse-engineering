.class public final La/T2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/N3;

.field public b:La/N3;

.field public c:La/N3;

.field public d:La/N3;

.field public e:La/N3;

.field public f:La/N3;

.field public g:La/N3;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/N3;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:I

.field public k:F

.field public final l:I

.field public final m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z


# direct methods
.method public constructor <init>(La/N3;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La/T2;->k:F

    iput-object p1, p0, La/T2;->a:La/N3;

    iput p2, p0, La/T2;->l:I

    iput-boolean p3, p0, La/T2;->m:Z

    return-void
.end method
