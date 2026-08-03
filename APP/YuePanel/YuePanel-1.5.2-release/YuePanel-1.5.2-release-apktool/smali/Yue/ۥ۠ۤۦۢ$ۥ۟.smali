.class public final LYue/ۥ۠ۤۦۢ$ۥ۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:J

.field public final ۥ۟:Lde/robv/android/xposed/XC_MethodHook$Unhook;

.field public final ۥ۟۟:Ljava/lang/reflect/Member;

.field public final ۥ۟۟۟:J

.field public volatile ۥ۟۟۟۟:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x431

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(JLde/robv/android/xposed/XC_MethodHook$Unhook;Ljava/lang/reflect/Member;J)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟۟۟۟:Z

    .line 4
    iput-wide p1, p0, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ:J

    .line 5
    iput-object p3, p0, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 6
    iput-object p4, p0, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟۟:Ljava/lang/reflect/Member;

    .line 7
    iput-wide p5, p0, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟۟۟:J

    return-void
.end method

.method public synthetic constructor <init>(JLde/robv/android/xposed/XC_MethodHook$Unhook;Ljava/lang/reflect/Member;JLYue/ۥ۠ۤۦۢ$ۥ;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LYue/ۥ۠ۤۦۢ$ۥ۟;-><init>(JLde/robv/android/xposed/XC_MethodHook$Unhook;Ljava/lang/reflect/Member;J)V

    return-void
.end method

.method public static native synthetic ۥ(LYue/ۥ۠ۤۦۢ$ۥ۟;)J
.end method

.method public static native synthetic ۥ۟(LYue/ۥ۠ۤۦۢ$ۥ۟;)Z
.end method

.method public static native synthetic ۥ۟۟(LYue/ۥ۠ۤۦۢ$ۥ۟;Z)Z
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۠ۤۦۢ$ۥ۟;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۤۦۢ$ۥ۟;->ۥ۟:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    return-object p0
.end method

.method public static native synthetic ۥ۟۟۟۟(LYue/ۥ۠ۤۦۢ$ۥ۟;)Ljava/lang/reflect/Member;
.end method


# virtual methods
.method public native ۥ۟۟۟۠()J
.end method

.method public native ۥ۟۟۟ۡ()J
.end method

.method public native ۥ۟۟۟ۢ()Ljava/lang/reflect/Member;
.end method

.method public native ۥۣ۟۟۟()Z
.end method

.method public native ۥ۟۟۟ۤ()LYue/ۥ۠ۤۦۢ$ۥ۟۟;
.end method

.method public native ۥ۟۟۟ۥ()Z
.end method
