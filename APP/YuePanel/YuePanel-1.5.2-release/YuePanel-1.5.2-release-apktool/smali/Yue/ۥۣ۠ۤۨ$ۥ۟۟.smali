.class public final LYue/ۥۣ۠ۤۨ$ۥ۟۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۤۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:I

.field public final ۥ۟:I

.field public final ۥ۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x13a

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;->ۥ(LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;)I

    move-result v0

    iput v0, p0, LYue/ۥۣ۠ۤۨ$ۥ۟۟;->ۥ:I

    .line 4
    invoke-static {p1}, LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;->ۥ۟(LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;)I

    move-result v0

    iput v0, p0, LYue/ۥۣ۠ۤۨ$ۥ۟۟;->ۥ۟:I

    .line 5
    invoke-static {p1}, LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;->ۥ۟۟(LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;)I

    move-result p1

    iput p1, p0, LYue/ۥۣ۠ۤۨ$ۥ۟۟;->ۥ۟۟:I

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;LYue/ۥۣ۠ۤۨ$ۥ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LYue/ۥۣ۠ۤۨ$ۥ۟۟;-><init>(LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;)V

    return-void
.end method

.method public static native ۥ()LYue/ۥۣ۠ۤۨ$ۥ۟۟$ۥ;
.end method


# virtual methods
.method public native ۥ۟()I
.end method

.method public native ۥ۟۟()I
.end method

.method public native ۥ۟۟۟()I
.end method
