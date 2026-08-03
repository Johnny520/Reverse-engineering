.class public final LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۤۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣ۠ۤۨ$ۥ۟۟۟;

.field public ۥ۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x280

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۣ۠ۤۨ$ۥ۟۟۟;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠ۤۨ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۟;->ۥ۟:I

    .line 4
    iput-object p1, p0, LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۟;->ۥ:LYue/ۥۣ۠ۤۨ$ۥ۟۟۟;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣ۠ۤۨ$ۥ۟۟۟;LYue/ۥۣ۠ۤۨ$ۥ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۟;-><init>(LYue/ۥۣ۠ۤۨ$ۥ۟۟۟;)V

    return-void
.end method

.method public static native synthetic ۥ(LYue/ۥۣ۠ۤۨ$ۥ۟۟۟۟;I)V
.end method


# virtual methods
.method public final native ۥ۟(I)V
.end method
