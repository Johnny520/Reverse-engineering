.class public interface abstract Lhc/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lb/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lb/e;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyNavigableMap()Ljava/util/NavigableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    invoke-direct {v0, v1, v3, v2}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lhc/b;->a:Lb/e;

    .line 15
    .line 16
    return-void
.end method
