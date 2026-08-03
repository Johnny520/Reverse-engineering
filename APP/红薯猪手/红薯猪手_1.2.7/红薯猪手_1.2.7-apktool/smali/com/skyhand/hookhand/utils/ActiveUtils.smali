.class public final Lcom/skyhand/hookhand/utils/ActiveUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/skyhand/hookhand/utils/ActiveUtils;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/skyhand/hookhand/utils/ActiveUtils;

    invoke-direct {v0}, Lcom/skyhand/hookhand/utils/ActiveUtils;-><init>()V

    sput-object v0, Lcom/skyhand/hookhand/utils/ActiveUtils;->INSTANCE:Lcom/skyhand/hookhand/utils/ActiveUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final isModuleEnabledByXposed()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
