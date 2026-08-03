.class public final synthetic L۟/c6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ۥ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/c6;->ۥ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 0

    iget-object p1, p0, L۟/c6;->ۥ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-static {p1}, L۟/d6;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    const/4 p1, 0x1

    return p1
.end method
