.class public Lcom/tendcloud/tenddata/bv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/tendcloud/tenddata/a;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Lorg/json/JSONArray;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lcom/tendcloud/tenddata/cs;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    iput-object v0, p0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    iput-object v0, p0, Lcom/tendcloud/tenddata/bv;->e:Landroid/util/Pair;

    iput-object v0, p0, Lcom/tendcloud/tenddata/bv;->f:Lcom/tendcloud/tenddata/cs;

    iput-object v0, p0, Lcom/tendcloud/tenddata/bv;->g:Ljava/lang/String;

    return-void
.end method
