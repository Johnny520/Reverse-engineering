.class public final Lcom/highcapable/kavaref/extension/ClassLoaderProvider;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final INSTANCE:Lcom/highcapable/kavaref/extension/ClassLoaderProvider;

.field private static classLoader:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/highcapable/kavaref/extension/ClassLoaderProvider;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/highcapable/kavaref/extension/ClassLoaderProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/highcapable/kavaref/extension/ClassLoaderProvider;->INSTANCE:Lcom/highcapable/kavaref/extension/ClassLoaderProvider;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    sget-object p0, Lcom/highcapable/kavaref/extension/ClassLoaderProvider;->classLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setClassLoader(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/highcapable/kavaref/extension/ClassLoaderProvider;->classLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    return-void
.end method
