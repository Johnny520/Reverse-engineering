.class public final Lw/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# static fields
.field public static final g:Lw/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw/e;->g:Lw/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    const v0, 0x4dffeb3b    # 5.3670077E8f

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lf1/c0;->c(I)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    new-instance v2, Lf1/w;

    .line 9
    .line 10
    invoke-direct {v2, v0, v1}, Lf1/w;-><init>(J)V

    .line 11
    .line 12
    .line 13
    return-object v2
.end method
