.class public final synthetic LYue/ۥ۠ۤۥۥ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۤ:I

.field public final synthetic ۥ۟۟۠ۥ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۤۥۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput p2, p0, LYue/ۥ۠ۤۥۥ;->ۥ۟۟۠ۤ:I

    iput-object p3, p0, LYue/ۥ۠ۤۥۥ;->ۥ۟۟۠ۥ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۤۥۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۠ۤۥۥ;->ۥ۟۟۠ۤ:I

    iget-object v2, p0, LYue/ۥ۠ۤۥۥ;->ۥ۟۟۠ۥ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-static {v0, v1, v2}, LYue/ۥ۠ۤۥۧ;->ۥ(Ljava/lang/Object;ILde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method
