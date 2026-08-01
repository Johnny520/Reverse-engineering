.class public final Ly0/c;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ly0/d;


# direct methods
.method public constructor <init>(Ly0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly0/c;->a:Ly0/d;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 7

    .line 1
    const-string v0, "consoleMessage"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const-string v1, "d"

    .line 27
    .line 28
    const-string v2, "console: "

    .line 29
    .line 30
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object v1, Ly0/b;->a:[I

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    aget v1, v1, v2

    .line 45
    .line 46
    :goto_0
    const/4 v2, 0x1

    .line 47
    const/4 v3, 0x6

    .line 48
    if-eq v1, v2, :cond_3

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    if-eq v1, v2, :cond_2

    .line 52
    .line 53
    const/4 v2, 0x3

    .line 54
    if-eq v1, v2, :cond_1

    .line 55
    .line 56
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    return p1
.end method

.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ly0/c;->a:Ly0/d;

    .line 5
    .line 6
    iget-object p1, p1, Ly0/d;->a:Ly0/e;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, p2}, Ly0/e;->j(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
