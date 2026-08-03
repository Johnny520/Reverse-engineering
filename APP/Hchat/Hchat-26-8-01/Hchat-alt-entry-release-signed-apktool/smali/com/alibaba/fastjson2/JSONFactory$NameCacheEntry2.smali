.class final Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NameCacheEntry2"
.end annotation


# instance fields
.field final name:Ljava/lang/String;

.field final value0:J

.field final value1:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value0:J

    .line 7
    .line 8
    iput-wide p4, p0, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value1:J

    .line 9
    .line 10
    return-void
.end method
