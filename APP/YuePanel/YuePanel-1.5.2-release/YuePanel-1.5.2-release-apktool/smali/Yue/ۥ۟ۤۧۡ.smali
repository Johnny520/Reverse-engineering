.class public LYue/ۥ۟ۤۧۡ;
.super Ljava/lang/Object;


# instance fields
.field public ۥ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06df\u06e4\u06e7\u06e0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x450

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۤۧۡ;->ۥ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public native ۥ()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06df\u06e4\u06e7\u06e0;",
            ">;"
        }
    .end annotation
.end method

.method public native ۥ۟(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06df\u06e4\u06e7\u06e0;",
            ">;)V"
        }
    .end annotation
.end method
